class SoccerManExecute

  def excute_nakata
    nakata = SoccerManNakata.new
    nakata.get_status
    nakata.run
    nakata.get_status
    nakata.stop
    nakata.get_status
    nakata.sprint_speed
    nakata.practice
    nakata.acceleration
    nakata.get_status
	end

  def excute_gon
    gon = SoccerManGon.new
    gon.get_status
    gon.run
    gon.get_status
    gon.stop
    gon.get_status
    gon.sprint_speed
    gon.practice
    gon.acceleration
    gon.get_status
  end

end
