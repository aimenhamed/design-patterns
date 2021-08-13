public class Main {
    public static void main(String[] args) {
        strategyMain();
    }

    /*
     * Memento Design Pattern
     */
    public static void mementoMain() {
        var editor = new Editor();
        var history = new History();

        editor.setContent("A");
        history.push(editor.createState());

        editor.setContent("B");
        history.push(editor.createState());

        editor.setContent("C");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }

    /*
     * State Design Pattern
     */
    public static void stateMain() {
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }

    /*
     * Strategy Design Pattern
     */
    public static void strategyMain() {
        var mercAmg = new Car(new EngineV6());
        mercAmg.start();
    }
}
