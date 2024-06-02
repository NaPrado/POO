require_relative 'figure'
require_relative 'point'
class Rectangle < Figure
  def initialize(inicio,fin)
    raise "Se debe ingresar objetos tipo Point" if !inicio.is_a?(Point) || !fin.is_a?(Point)
    @inicio = inicio
    @fin = fin
  end

  def perimeter
    @inicio.distance_x(@fin)*2+@inicio.distance_y(@fin)*2
  end

  def area
    @inicio.distance_x(@fin)*@inicio.distance_y(@fin)
  end

  def to_s
    "Rectangle: [ #{@inicio} , #{@fin} ]"
  end
  def == other
    other.is_a?(Rectangle) && @inicio == other.inicio && @fin == other.fin
  end

  def hash
    [@inicio,@fin].hash
  end
  protected
  attr_accessor :inicio, :fin
end