require_relative 'movie'
require_relative 'customer'
class VideoClub
  def initialize
    @movies = Hash.new {} # Pares <Título Película, Instancia de Movie>
    @customers = Hash.new {} # Pares <Nombre Cliente, Instancia de Customer>
  end

  def add_movie(movie_title, movie_category)
    @movies[movie_title] = Movie.new(movie_title, movie_category)
  end


  def add_customer(customer_name)
    @customers[customer_name] = Customer.new(customer_name)
  end


  def rent(movie_title, customer_name, rent_days)
    raise "Movie #{movie_title} not found" unless @movies.key? movie_title
    raise "Customer #{customer_name} not found" unless @customers.key? customer_name
    movie = @movies[movie_title]
    customer = @customers[customer_name]
    customer.add_points(movie.category.points(rent_days))
    customer.add_charges(movie.category.charges(rent_days))
  end

  def resume(customer_name)
    raise "Customer #{customer_name} not found" unless @customers.include? customer_name
    customer = @customers[customer_name]
    "Resume points: #{customer.points}, charge: #{customer.charges}"
  end

  private

  def add_points(movie, customer, rent_days)
    customer.add_points(1) # Cada película alquilada suma un punto
    # Si es estreno suma un punto extra por cada día extra alquilada
    customer.add_points(rent_days - 1) if rent_days > 1 && movie.category == MovieCategory::RECENT
  end

end
