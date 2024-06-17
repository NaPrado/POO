require 'set/sorted_set'
require_relative 'table'

class Restaurant

  def initialize (name)
	  @name=name
    @map=Hash.new
  end

  def add_table ( sect, mesa_name, cap )
    @map[sect]= SortedSet.new if @map.key?(sect)
    @map[sect] << Table.new(mesa_name,cap,sect)
  end
  def tables sect
    raise "Section does not exists" unless @map.key?(sect)
    @map[sect]
  end
  def section_count
    @map.size
  end

  def table_count(sect)
    tables(sect).size
  end
end
