require_relative 'expression'
class SimpleExpression
  include Expression

  attr_writer :value

  def initialize(value)
    @value = value
  end
  def evaluate
    @value
  end
  def not
    require_relative 'not'
    Not.new(self)
  end
  def or(expression)
    require_relative 'or'
    Or.new(self,expression)
  end
  def and(expression)
    require_relative 'and'
    And.new(self,expression)
  end
  attr_accessor :value
end
