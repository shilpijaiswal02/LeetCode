class Solution {
    public double[] convertTemperature(double celsius) {
        double[] list= new double[2];
        double k=celsius+273.15;
        list[0]=k;
        double f= celsius*1.80+32.00;
        list[1]=f;
        return list;
    }
}