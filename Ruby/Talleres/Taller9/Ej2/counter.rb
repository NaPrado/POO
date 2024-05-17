class Counter
  attr_accessor :count
  def initialize
    @count = 0
  end
  def increment
    @count += 1
  end
  def decrement
    @count -= 1
  end
  def to_s
    count.to_s
  end
end