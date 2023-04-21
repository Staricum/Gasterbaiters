public class ConcreteMediator extends Mediator 
{
    public ConcreteColleague1 Colleague1;
    public ConcreteColleague2 Colleague2;

    

    public void Send (String msg,Colleague colleague)
    {
        if (Colleague1 == colleague)
        Colleague2.Notify(msg);
        else
        Colleague1.Notify(msg);
    }
}