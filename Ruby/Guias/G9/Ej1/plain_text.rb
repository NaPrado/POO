require_relative 'html_text'

class PlainText
  include HTMLText

  attr_writer :content

  def initialize(content)
    @content = content
  end

  def source
    @content
  end
end
