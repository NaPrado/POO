require_relative 'figure.rb'
class Figure
  def initialize
    raise 'No se puede instanciar una Figura'
  end

  def perimeter
    raise 'Necesita implementar el método perimeter'
  end

  def area
    raise 'Necesita implementar el método area'
  end
  def inspect
    to_s
  end
  def <=>(other)
    return nil unless other.is_a? Figure
    area <=> other.area
  end
  alias eql? ==
end