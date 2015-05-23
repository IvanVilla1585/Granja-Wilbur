from django.db import models 

class Product(models.Model):
	idProduct = models.AutoField(primary_key=True) 
	name = models.CharField(max_length=60) 
	salePrice = models.PositiveIntegerField()
	
	def __unicode__(self):
		return self.name
