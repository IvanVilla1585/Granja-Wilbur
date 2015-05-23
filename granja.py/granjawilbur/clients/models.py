from django.db import models

class Client(models.Model):
	idClient = models.AutoField(primary_key=True)
	document = models.PositiveIntegerField()
	typeDocument = models.CharField(max_length=30)
	name = models.CharField(max_length=60)
	surname = models.CharField(max_length=60) 
	address = models.CharField(max_length=100)
	phone = models.PositiveIntegerField()
	movil = models.PositiveIntegerField(blank=True) 


	def __unicode__(self):
		return self.document
