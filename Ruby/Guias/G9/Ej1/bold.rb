require_relative 'format'
class Bold < Format
  ELEMENT='b'
  def initialize(content)
    super(content,ELEMENT)
  end
end