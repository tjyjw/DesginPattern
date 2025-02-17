package BlackBoardPattern;

public class BulletinBoard
{
    public static void main(String[] args)
    {
        Blackboard blackboard = new Blackboard();
        Control control = new Control(blackboard);
        control.nextSource("主题活动   开放时间");
        control.nextSource("电影放映   12:00~14:00");
        control.nextSource("刺激射击   18:00~22:00");
        control.nextSource("浪漫花车   18:00~22:00");
        control.nextSource("天真木马   18:00~22:00");
        control.nextSource("精彩烟花   18:00~22:00");
        control.nextSource("今日游乐园设施一切正常，敬请期待！");
        control.nextSource("今日游乐园KCF餐厅推出新产品！");
        control.loopNonPrint();
        blackboard.Print();
    }
}
