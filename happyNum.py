def pow_sum(n):
  s=0
  while n>0:
    r=n%10
    s+=r**2
    n//=10
  return s

n=int(input())

slow=n
fast=pow_sum(n)
ishappy=False

while slow!=fast:
  if fast==1:
    ishappy=True
    break
  slow=pow_sum(slow)
  fast=pow_sum(pow_sum(fast))
  
if ishappy:
  print("Happy Number")
else:
  print("Not Happy Number")