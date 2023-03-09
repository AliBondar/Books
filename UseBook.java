public class UseBook {

    public static void main(String[] args) {

        Book b1 = new Fiction("pulp");
        Book b2 = new NonFiction("crime and punishment");
        Book b3 = new NonFiction("Notes");
        BookArray.showDetails(new Book[]{b1,b2,b3});
    }
}
