public class ConcreteColleague1 extends Colleague
{
    public ConcreteColleague1(Mediator mediator)
    {
        super(mediator);

    }

    public void Send(String message)
    {
        mediator.Send(message, this);
    }

    public void Notify(String message)
    {
        System.out.println(message);
    }
}