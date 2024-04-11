package Guias.TP4.Ej5;

public class FormatText extends BasicText{
    protected HTMLText element;
    String format;
    FormatText(HTMLText element, String format){
        this.element=element;
        this.format=format;
    }

    @Override
    public String source() {
        return "<%s>%s</%s>".formatted(format, element.source(), format);
    }
}
