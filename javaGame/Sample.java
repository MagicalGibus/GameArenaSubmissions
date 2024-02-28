public class Sample
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(900, 500);
        Ball b = new Ball(250, 150, 20, "GREEN");
        Ball a = new Ball(100, 50, 30, "BLUE");

        arena.addBall(b);
        arena.addBall(a);

        while(true)
        {
            arena.pause();
        }
    }
}
