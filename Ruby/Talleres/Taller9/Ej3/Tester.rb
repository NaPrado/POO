require_relative 'counter'
require_relative 'multiple_counter'

my_counter = Counter.new
puts my_counter.count # Imprime 0
my_counter.increment # Aumenta en 1
my_counter.increment
puts my_counter.count # Imprime 2
my_counter.decrement # Disminuye en 1
puts my_counter.count # Imprime 1

my_counter.count = 10 # Setea el contador
my_counter.increment
puts my_counter.count # Imprime 11

puts my_counter # Imprime 11

double_counter = MultipleCounter.new(2)
puts double_counter # Imprime 0
double_counter.increment # Aumenta en 2
double_counter.increment
puts double_counter # Imprime 4
double_counter.decrement # Disminuye en 2
puts double_counter # Imprime 2
double_counter.count = 10
double_counter.increment
puts double_counter # Imprime 12