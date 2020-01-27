public class TimeCounter {

    private long tInit, tEnd;
    private float time;
    View View = new View();

    public TimeCounter(){

    }
    public void settInit(){
        tInit=System.currentTimeMillis();
    }
    public void settEnd(){
        tEnd=System.currentTimeMillis();
        calculateTime();
    }
    private void calculateTime(){
        time=(tEnd-tInit) / 1000F;
        View.resultTimeEx(time);
    }

}
