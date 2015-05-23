from django.db import models

class Provider(models.Model):
	idProvider = models.AutoField(primary_key=True) 
	nit = models.CharField(max_length=30)
	name = models.CharField(max_length=60)
	surname = models.CharField(max_length=60) 
	address = models.CharField(max_length=100)
	phone = models.PositiveIntegerField()
	movil = models.PositiveIntegerField(blank=True)
	fax = models.PositiveIntegerField()  
	email = models.EmailField(max_length=60)


	def __unicode__(self):
		return self.name
