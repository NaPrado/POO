require_relative 'expression'
class Or
  include Expression
  def initialize(a,b)
    @a = a
    @b = b
  end

  def evaluate
    @a.evaluate || @b.evaluate
  end
end