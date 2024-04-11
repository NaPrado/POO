package Guias.TP4.Ej5;

public class PlainText extends BasicText{
    String text;
    public PlainText(String text){
        setText(text);
    }
    public void setText(String text){
        this.text=text;
    }

    @Override
    public String source() {
        return text;
    }
}
