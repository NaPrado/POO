class Ticket
  NUMERATION_START = 1000
  @@numeration = NUMERATION_START - 1

  def initialize
    @id = Ticket.increment_and_get
    @items = []
  end

  def self.increment_and_get
    @@numeration += 1
  end

  def add(product, units)
    @items << Item.new(product, units)
  end
  def to_s
    s = "TICKET Nº #{@id}\n"
    s += "####################\n"
    @items.each { |item| s += "#{item}\n" }
    s += "####################\n"
    s + "TOTAL $#{format('%.2f', total)}"
  end

  def total
    @items.map { |item| item.total }.reduce { |accum, e| accum + e }
  end
end
