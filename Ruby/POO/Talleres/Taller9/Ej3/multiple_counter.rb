class MultipleCounter
  attr_accessor :count
  def initialize(inc)
    @inc = inc
    @count = 0
  end
  def increment
    @count = @count+@inc
  end
  def decrement
    @count = @count+@inc
  end
  def to_s
    count.to_s
  end
end