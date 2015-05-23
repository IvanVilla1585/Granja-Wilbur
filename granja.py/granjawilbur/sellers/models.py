from django.db import models

class Seller(models.Model):
	idSeller = models.AutoField(primary_key=True)
	document = models.PositiveIntegerField()
	typeDocument = models.CharField(max_length=30)
	name = models.CharField(max_length=60)
	lastName = models.CharField(max_length=60)
	dateBirth = models.DateField(blank=True)
	department = models.CharField(max_length=30, blank=True)
	municipality = models.CharField(max_length=30, blank=True)
	contractDate = models.DateField(blank=False)
	typeContract = models.CharField(max_length=100)
	address = models.CharField(max_length=100)
	phone = models.PositiveIntegerField()
	movil = models.PositiveIntegerField()
	email = models.EmailField(max_length=60)


	def __unicode__(self):
		return self.document
