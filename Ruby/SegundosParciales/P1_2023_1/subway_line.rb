

class SubwayLine
  include Comparable
  def initialize(letter)
    @letter = letter
  end

  def to_s
    "Subway Line #{letter}"
  end

  def <=>(other)
    return nil unless other.is_a? SubwayLine
    @letter <=> other.letter
  end

  def hash
    [@letter].hash
  end

  def ==(other)
    @letter == other.letter
  end
  alias_method :eql?, :==
  attr_reader :letter
end
