class Wheel
  def initialize(rim,tire)
    @rim = rim
    @tire = tire
  end
  def diametre
    @rim+(2*@tire)
  end
end