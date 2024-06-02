require_relative 'figure'
class Ellipse < Figure
  def initialize(inicio,ancho,alto)
    raise "Se ingresaron datos de clases invalidas"if !inicio.is_a?(Point) && (!ancho.is_a?(Integer) || !ancho.is_a?(Float)) && (!alto.is_a?(Integer) || !alto.is_a?(Float))
    @inicio = inicio
    @ancho = ancho
    @alto = alto
  end

  def perimeter
    2*Math::PI*((@ancho**2+@alto**2)/2)**0.5
  end

  def area
    Math::PI*@alto*@ancho
  end
  def to_s
    "Ellipse: [ Centro: #{@inicio} , DMayor: #{@ancho} , DMenor: #{@alto} ]"
  end
  def == other
    other.is_a?(Ellipse) && other.inicio==@inicio && other.ancho==@ancho && other.alto==@alto
  end
  def hash
    [inicio,ancho,alto].hash
  end
  protected
  attr_accessor :inicio, :ancho, :alto
end