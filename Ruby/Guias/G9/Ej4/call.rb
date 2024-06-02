class Call
  COST_PER_SECOND = 0.01

  def initialize(from, to, duration)
    @from = from
    @to = to
    @duration = duration
  end

  def cost
    @duration * COST_PER_SECOND
  end
  attr_reader :to
end