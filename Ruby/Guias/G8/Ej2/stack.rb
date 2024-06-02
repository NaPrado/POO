class Stack
def initialize
  @elements = []
end

def empty?
  @elements.empty?
end

def push(element)
  @elements.push(element)
end

def pop
  empty_check
  @elements.pop
end

def peek
  empty_check
  @elements.last
end

def empty_check
  raise 'Stack is empty' if empty?
end

def to_s
  @elements.to_s
end

private :empty_check
end
