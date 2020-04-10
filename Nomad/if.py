def age_check(age):
  print(f"you are {age}")
  if age<18:
    print("You can't drink!!")
  elif age==18:
    print("You are new to this, Adjust your drinking capacity.")
  elif age>20 and age<25:
    print("You are still kind of young, hmm is that really true?")
  else:
    print("enjoy your drink")

age_check(18)
