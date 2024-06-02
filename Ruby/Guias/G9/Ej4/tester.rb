require_relative 'friend_cell_phone_bill'
require_relative 'cell_phone_bill'
require_relative 'call'
my_bill = FriendCellPhoneBill.new('4444-4444', 3)

FriendCellPhoneBill.change_cost(98)

my_bill.add_friend('5555-5555')
my_bill.add_friend('6666-6666')
my_bill.register_call('5555-5555', 10)
my_bill.register_call('6666-5555', 10)
puts my_bill.process_bill
begin
  my_bill.add_friend('6666-6666')
rescue RuntimeError => e
  puts e.message
end
my_bill.add_friend('4444-4444')
begin
  my_bill.add_friend('7777-7777')
rescue RuntimeError => e
  puts e.message
end
my_bill.remove_friend('5555-5555')
begin
  my_bill.remove_friend('5555-5555')
rescue RuntimeError => e
  puts e.message
end
