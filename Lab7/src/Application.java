
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    private List<Transaction> tranzactii = new ArrayList<>();

    private static int transactionId = 1;

    public void efectueazaPlata(double amount, Currency currency, User user, String purpose) {
        Payment plata = new Payment(amount, currency, user, purpose);
        Transaction tranzactie = new Transaction(transactionId, plata);
        transactionId++;
        tranzactii.add(tranzactie);
        System.out.println("Tranzactie efectuata: " + tranzactie);
    }

    public void storneazaTranzactie(int id) {
        for(Transaction t : tranzactii) {
            if(t.getId() == id) {
                Transaction storno = t.stornare();
                tranzactii.add(storno);
                System.out.println("Tranzactie initiala: " + t);
                System.out.println("Tranzactie stornata: " + storno);
                return;
            }
        }
    }

    public void afisareTari() {
        System.out.println("Tari din care s-au efectuat plati: ");
        tranzactii.stream()
                .map(tranzactie -> tranzactie.getPayment().getCurrency().getCountryName())
                .distinct()
                .forEach(System.out::println);
    }

    public void afisareTranzactiiUser(User user) {
        System.out.println("Tranzactii pentru: " + user.getFirstName() + " " + user.getLastName() + ": ");
        tranzactii.stream()
                .filter(tranzactie -> tranzactie.getPayment().getUser().equals(user))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        User user1 = new User("Ana", "Popovici", "RO12345");
        User user2 = new User("Mark", "Anton", "RO4535");

        Application app = new Application();

        app.efectueazaPlata(1000, Currency.USD, user1, "Plata test");
        app.efectueazaPlata(200, Currency.EUR, user1, "Test test");
        app.efectueazaPlata(3000, Currency.RON, user1, "Cumparaturi");
        app.efectueazaPlata(50000, Currency.TRY, user2, "...");

        app.storneazaTranzactie(2);

        app.afisareTari();
        app.afisareTranzactiiUser(user1);
    }

}
