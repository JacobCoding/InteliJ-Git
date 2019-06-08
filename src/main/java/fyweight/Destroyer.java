package fyweight;

public class Destroyer {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public Destroyer(int x, int y) {
        stats = UnitStatsRepository.getDestroyerStats(); // zwraca wskaźnik na raz utworzoy obiekt (w klasie UnitStatsRepository )
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
