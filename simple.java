public class simple {
    double principal,time,rate_of_interest;
    public simple(double p,double t,double r){
        principal=p;
        time=t;
        rate_of_interest=r;
    }
}
class sim_in extends simple{
    public sim_in(double principal,double time,double rate_of_interest)
    {
        super(principal,time,rate_of_interest);
    }
    public double cal()
    {
        return (principal*time*rate_of_interest)/100;
    }
}
class com_in extends simple{
    public com_in(double principal,double time,double rate_of_interest)
    {
        super(principal,time,rate_of_interest);
    }
    public double cal()
    {
        return (principal+Math.pow((1+rate_of_interest),time));
    }
}