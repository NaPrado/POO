class SubwayCard
  @central
  def initialize
    raise "Abstract Class"
  end
  def ride?
    raise "Abstract Class"
  end
  def ride
    raise "Abstract Class"
  end
  def to_s
    "Subway Card [Central: #{@central}]"
  end
end