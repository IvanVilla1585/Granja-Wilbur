from django.db import models
from products.models import Product


class WareHouse(models.Model):
	idWareHouse = models.AutoField(primary_key=True)
	idProduct = models.ForeignKey(Product)
	stock = models.PositiveIntegerField()

	def __unicode__(self):
		return self.idProduct
