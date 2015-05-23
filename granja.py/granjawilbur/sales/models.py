from django.db import models
from clients.models import Client 
from products.models import Product

class Sale(models.Model):
	idSale = models.AutoField(primary_key=True)
	dateSale = models.DateField() 
	idClient = models.ForeignKey(Client)
	idProduct = models.ForeignKey(Product) 
	quantity = models.PositiveIntegerField()
	iva = models.DecimalField(decimal_places=3, max_digits=10) 
	subTotal = models.DecimalField(decimal_places=3, max_digits=10)
	totalSale = models.DecimalField(decimal_places=3, max_digits=10)

	def __unicode__(self):
		return self.idProduct
