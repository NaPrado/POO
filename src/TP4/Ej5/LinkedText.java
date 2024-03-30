package TP4.Ej5;

public class LinkedText extends FormatText{
    LinkedText(HTMLText text,String link){
        super(text,link);
    }
    @Override
    public String source() {
        return "<a href:%s>%s</a>".formatted(format, element.source());
    }
}
