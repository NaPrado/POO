class Item
  def initialize(product, units)
    @product = product
    @units = units
  end

  def total = @product.unit_price * @units

  def to_s
    "#{format('%-15s', @product.description)}\t#{@units}\t$#{format('%.2f', @product.unit_price)}"
  end
end

class Product
  attr_reader :description, :unit_price

  def initialize(description, unit_price)
    @description = description
    @unit_price = unit_price
  end
end
