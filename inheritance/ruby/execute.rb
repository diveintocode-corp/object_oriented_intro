class Execute

  def excute_super_car
    super_car = SuperCar.new
    super_car.get_status
    super_car.run
    super_car.get_status
    super_car.stop
    super_car.get_status
  end

  def excute_truck
    truck = Truck.new
    truck.get_status
    truck.run
    truck.load
    truck.get_status
    truck.stop
    truck.get_status
  end

end
