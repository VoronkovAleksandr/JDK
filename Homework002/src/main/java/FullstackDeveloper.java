public class FullstackDeveloper implements Backender, Frontender{

    @Override
    public void developServer() {
        System.out.println("Разрабатываю сервер");
    }

    @Override
    public void developGUI() {
        System.out.println("Разрабатываю графический интерфейс");
    }
}
