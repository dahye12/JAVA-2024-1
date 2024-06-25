import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AIOT3 {

    public static class library {
        private List<Item> items;
        private List<Review> reviews;

        public library() {
            items = new ArrayList<>();
            reviews = new ArrayList<>();
        }

        public void addItem(Item item) {
            items.add(item);
            System.out.println("자료가 성공적으로 추가되었습니다.");
        }

        public void searchItem(String genre, String creator) {
            boolean found = false;
            for (Item item : items) {
                if (item.getGenre().equalsIgnoreCase(genre) &&
                        ((item instanceof Book && ((Book) item).getAuthor().equalsIgnoreCase(creator)) ||
                                (item instanceof DVD && ((DVD) item).getDirector().equalsIgnoreCase(creator)) ||
                                (item instanceof Music && ((Music) item).getArtist().equalsIgnoreCase(creator)))) {
                    item.displayInfo();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("해당 조건에 맞는 자료를 찾을 수 없습니다.");
            }
        }

        public void registerBorrow(String title) {
            for (Item item : items) {
                if (item.getTitle().equalsIgnoreCase(title) && item.isAvailable()) {
                    item.setAvailable(false);
                    System.out.println("자료가 성공적으로 대여되었습니다.");
                    return;
                }
            }
            System.out.println("말씀하신 자료는 저희 도서관에 구비되어있지 않습니다.");
        }

        public void registerReturn(String title) {
            for (Item item : items) {
                if (item.getTitle().equalsIgnoreCase(title) && !item.isAvailable()) {
                    item.setAvailable(true);
                    System.out.println("자료가 성공적으로 반납되었습니다.");
                    return;
                }
            }
            System.out.println("자료를 반납할 수 없습니다.");
        }

        public void addReview(Review review) {
            reviews.add(review);
            System.out.println("리뷰가 성공적으로 추가되었습니다.");
        }

        public void displayAllItems() {
            for (Item item : items) {
                item.displayInfo();
            }
        }

        public void displayAllReviews() {
            for (Review review : reviews) {
                review.displayReview();
            }
        }
    }

    public static abstract class Item {
        private String title;
        private String genre;
        private boolean available;

        public Item(String title, String genre) {
            this.title = title;
            this.genre = genre;
            this.available = true;
        }

        public String getTitle() {
            return title;
        }

        public String getGenre() {
            return genre;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean isAvailable) {
            this.available = isAvailable;
        }

        public abstract void displayInfo();
    }

    public static class Book extends Item {
        private String author;

        public Book(String title, String genre, String author) {
            super(title, genre);
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public void displayInfo() {
            System.out.println("Title: " + getTitle());
            System.out.println("Genre: " + getGenre());
            System.out.println("Author: " + author);
            System.out.println("Available: " + isAvailable());
        }
    }

    public static class DVD extends Item {
        private String director;

        public DVD(String title, String genre, String director) {
            super(title, genre);
            this.director = director;
        }

        public String getDirector() {
            return director;
        }

        @Override
        public void displayInfo() {
            System.out.println("Title: " + getTitle());
            System.out.println("Genre: " + getGenre());
            System.out.println("Director: " + director);
            System.out.println("Available: " + isAvailable());
        }
    }

    public static class Music extends Item {
        private String artist;

        public Music(String title, String genre, String artist) {
            super(title, genre);
            this.artist = artist;
        }

        public String getArtist() {
            return artist;
        }

        @Override
        public void displayInfo() {
            System.out.println("Title: " + getTitle());
            System.out.println("Genre: " + getGenre());
            System.out.println("Artist: " + artist);
            System.out.println("Available: " + isAvailable());
        }
    }

    public static class Person {
        private String name;
        private String id;

        public Person(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }
    }

    public static class Review {
        private Person reviewer;
        private int rating;
        private String comment;

        public Review(Person reviewer, int rating, String comment) {
            this.reviewer = reviewer;
            this.rating = rating;
            this.comment = comment;
        }

        public Person getReviewer() {
            return reviewer;
        }

        public int getRating() {
            return rating;
        }

        public String getComment() {
            return comment;
        }

        public void displayReview() {
            System.out.println("Reviewer: " + reviewer.getName());
            System.out.println("Rating: " + rating);
            System.out.println("Comment: " + comment);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            library librarySystem = new library();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
                System.out.println("            책 GPT");
                System.out.println("    (ENTER 키를 눌러주세요)");
                System.out.println("|＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿|");
                System.out.println("          ᕱ ᕱ  ||");
                System.out.println("         ( ･ω･ ||");
                System.out.println("         /　つΦ");

                System.out.println("\n도서관 시스템 메뉴");
                System.out.println("1. 자료 등록하기");
                System.out.println("2. 자료 검색하기");
                System.out.println("3. 자료 대여하기");
                System.out.println("4. 자료 반납하기");
                System.out.println("5. 리뷰 추가하기");
                System.out.println("6. 모든 리뷰 보기");
                System.out.println("7. 종료");

                System.out.print("메뉴를 선택하세요: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        addItem(librarySystem, scanner);
                        break;
                    case 2:
                        searchItem(librarySystem, scanner);
                        break;
                    case 3:
                        registerBorrow(librarySystem, scanner);
                        break;
                    case 4:
                        registerReturn(librarySystem, scanner);
                        break;
                    case 5:
                        addReview(librarySystem, scanner);
                        break;
                   
                    case 6:
                        librarySystem.displayAllReviews();
                        break;
                    case 7:
                        System.out.println("시스템을 종료합니다.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                }
            }
        }

        private static void addItem(library library, Scanner scanner) {
            while (true) {
                System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
                System.out.println("‘자료 등록하기’ 항목을 선택하였습니다.");
                System.out.println("|＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿|");
                System.out.println("예시) 알기쉽게해설한자바, 김충석, 20200901, 책");
                System.out.println("[ 띄어쓰기 없이 입력해 주세요. ]");

                System.out.print("자료의 이름을 입력해 주세요: ");
                String title = scanner.nextLine();
                System.out.print("자료의 저자(제작자)를 입력해 주세요: ");
                String creator = scanner.nextLine();
                System.out.print("자료의 출판일을 입력해 주세요: ");
                String publicationDate = scanner.nextLine();
                System.out.print("자료의 장르를 입력해 주세요: ");
                String genre = scanner.nextLine();
                System.out.print("등록자 명을 입력해주세요: ");
                String registrant = scanner.nextLine();

                System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
                System.out.println("  자료 이름: " + title);
                System.out.println("  자료 저자: " + creator);
                System.out.println("  출판일: " + publicationDate);
                System.out.println("  장르: " + genre);
                System.out.println("  등록자 명: " + registrant);
                System.out.println("|＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿|");
                System.out.println("[입력한 내용이 맞다면 1, 틀리면 0을 입력해주세요.]");

                int confirmation = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (confirmation == 1) {
                    System.out.println("자료 종류를 선택하세요: 1. 책 2. DVD 3. 음악");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (type) {
                        case 1:
                            library.addItem(new Book(title, genre, creator));
                            break;
                        case 2:
                            library.addItem(new DVD(title, genre, creator));
                            break;
                        case 3:
                            library.addItem(new Music(title, genre, creator));
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                    }

                    System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
                    System.out.println("자료가 정상적으로 등록되었습니다.");
                    System.out.println("|＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿￣￣￣|");
                    System.out.println("[초기 화면으로 돌아가려면 ENTER을 입력해주세요]");
                    scanner.nextLine(); // Wait for Enter key

                    break;
                } else if (confirmation == 0) {
                    System.out.println("다시 입력하세요.");
                } else {
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                }
            }
        }

        private static void searchItem(library library, Scanner scanner) {
            System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
            System.out.println("‘자료 검색하기’ 항목을 선택하였습니다.");
            System.out.println("|＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿￣￣￣|");
            System.out.println("[ 띄어쓰기 없이 입력해 주세요. ]");

            System.out.print("자료의 장르를 입력해 주세요(책, DVD, 음악): ");
            String genre = scanner.nextLine();
            System.out.print("자료의 저자(제작자)를 입력해 주세요: ");
            String creator = scanner.nextLine();

            System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
            System.out.println("‘" + genre + "’을 검색하였습니다.");
            System.out.println("|＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿￣￣￣|");

            library.searchItem(genre, creator);

            System.out.println("[초기 화면으로 돌아가려면 ENTER을 입력해주세요]");
            scanner.nextLine(); // Wait for Enter key
        }

        private static void registerBorrow(library library, Scanner scanner) {
            System.out.print("대여할 자료의 제목을 입력하세요: ");
            String title = scanner.nextLine();
            library.registerBorrow(title);
        }

        private static void registerReturn(library library, Scanner scanner) {
            System.out.print("반납할 자료의 제목을 입력하세요: ");
            String title = scanner.nextLine();
            library.registerReturn(title);
        }

        private static void addReview(library library, Scanner scanner) {
            System.out.print("리뷰를 작성할 자료의 제목을 입력하세요: ");
            String title = scanner.nextLine();
            System.out.print("리뷰어 이름: ");
            String name = scanner.nextLine();
            System.out.print("리뷰어 ID: ");
            String id = scanner.nextLine();
            System.out.print("평점 (1-5): ");
            int rating = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("리뷰 내용: ");
            String comment = scanner.nextLine();

            Person reviewer = new Person(name, id);
            Review review = new Review(reviewer, rating, comment);
            library.addReview(review);
        }
    }
}

