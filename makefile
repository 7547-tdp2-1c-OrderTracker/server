.PHONY: vm-up vm-stop vm-destroy vm-reset vm-ssh db-console
vm-up:
	vagrant up

vm-stop:
	vagrant halt

vm-destroy:
	vagrant destroy

vm-reset: vm-stop vm-up

vm-ssh:
	vagrant ssh

db-console:
	mysql -h 127.0.0.1 -uroot -P 3000
