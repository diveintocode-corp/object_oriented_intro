class SoccerMan

  # スタミナ、スピード、スキル
  def initialize
	  @stamina = 100
		@pace = 0
		@skill = 0
  end

  def set_skill(new_skill)
    @skill = new_skill
  end

	def get_status
    puts("stamina:" + @stamina.to_s)
		puts("pace:" + @pace.to_s)
		puts("skill:" + @skill.to_s)
  end

	def run
    puts " -- run -- "
    @stamina -= 1
    @pace += 1
  end

	def stop
    puts " -- stop -- "
    @pace -= 1
  end

	def rest
    puts " -- rest -- "
    @stamina = 100
  end

	def acceleration
    puts " -- acceleration -- "
    @stamina -= 1
		@stamina -= 1
		@stamina -= 1
		@pace += 5
  end

  def sprint_speed
    puts " -- sprint_speed -- "
    @stamina -= 1
		@stamina -= 1
		@pace += @skill
	end

	def practice
    puts " -- practice -- "
    @skill += @skill
  end

end
