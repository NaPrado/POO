require_relative 'Accounts'
class CheckingAccount < Accounts
  def initialize(id,overdraft)
    @id = id
    @overdraft = overdraft
    @balance=0
  end
  def withdraw(amount)
    raise 'No cuenta con los fondos necesarios' unless self.withdraw?(amount)
    super(amount)
  end

  protected def withdraw?(amount)
    @balance + @overdraft - amount >= 0
  end
end