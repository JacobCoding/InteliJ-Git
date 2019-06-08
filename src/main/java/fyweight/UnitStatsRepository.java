package fyweight;

public class UnitStatsRepository {

    // static - class loader creates this value during object creation
    private static UnitStats destroyerStats = new UnitStats("Destroyer", 500, 250, 70, 10, 800);
    private static UnitStats riflemanUnitStats = new UnitStats("Rifleman", 200, 100, 50, 25, 0);
    private static UnitStats teslaTankUnitStats = new UnitStats("Destroyer", 500, 250, 70, 10, 0);

    public static UnitStats getDestroyerStats(){
        return  destroyerStats;
    }

    public static UnitStats getRiflemanUnitStatsStats(){
        return  riflemanUnitStats;
    }

    public static UnitStats getTeslaTankUnitStats(){
        return  teslaTankUnitStats;
    }


    private UnitStatsRepository(){}; // safety solution



}
