require_relative 'simple_expression'
class Not < SimpleExpression
  def evaluate
    !super.evaluate
  end
end