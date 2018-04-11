package daikin;

public class Application {
    private static DaikinPackage dp;

    public static void main(String[] args) {
        dp = new DaikinPackage();
        dp.setHeader1();
        dp.setHeader2();
        dp.setHeader3();

        dp.setWorkingState(WorkingState.valueOf("OFF").getState());
        dp.setModeTo(ModeState.valueOf("COOL").getState());
        dp.setDegreesTo(Integer.parseInt("21"));
        dp.setFanTo(FanState.valueOf("FANSILENT").getState());
        dp.setHorizontalSwingState(SwingState.valueOf("SWINGOFF").getState());
        dp.setVerticalSwingState(SwingState.valueOf("SWINGOFF").getState());

        String firstConfig = dp.getLircConfFileFirst();

        dp.setWorkingState(WorkingState.valueOf("ON").getState());
        dp.setModeTo(ModeState.valueOf("COOL").getState());
        dp.setDegreesTo(Integer.parseInt("24"));
        dp.setFanTo(FanState.valueOf("FANSILENT").getState());
        dp.setHorizontalSwingState(SwingState.valueOf("SWINGON").getState());
        dp.setVerticalSwingState(SwingState.valueOf("SWINGOFF").getState());

        System.out.println(dp.getLircConfFileAppend(firstConfig));
    }
}
