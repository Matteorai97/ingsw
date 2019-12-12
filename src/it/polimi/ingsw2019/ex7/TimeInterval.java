package it.polimi.ingsw2019.ex7;

public class TimeInterval {

    private float low, high;
    public float getLowerBound(){  return low; }
    public float getUpperBound(){  return high; }


    /*@
    @ assignable \nothing
    @ requires times != null && (\forall int i; 0 <= i < times.length - 1;
    @ times[i] < times[i+1]) && times.length >= 2 && timePoint < times[times.length - 1]
    @ && timePoint >= times[0]
    @ ensures timePoint >= \result.getLowerBound() && timePoint < \result.getUpperBound()
    @ (\exists int i; 0 <= i < times.length - 1; times[i] == \result.getLowerBound() &&
    @ times[i+1] == \result.getUpperBound())
    @ */
    public static TimeInterval getInterval(float[] times, float timePoint) {
        return null;
    }

}
